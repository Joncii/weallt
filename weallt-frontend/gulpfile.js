var gulp = require('gulp');
var sass = require('gulp-sass');
var browserSync = require('browser-sync').create();
var useref = require('gulp-useref');
var gulpIf = require('gulp-if');
var uglify = require('gulp-uglify');
var cssnano = require('gulp-cssnano');
var del = require('del');
var concat = require("gulp-concat");
var concatcss = require("gulp-concat-css");
var runSequence = require('run-sequence');

gulp.task('sass', function(){
	return gulp.src('src/scss/**/*.scss')
		.pipe(sass())
		.pipe(gulp.dest('src/css'))
		.pipe(browserSync.reload({
			stream: true
		}))
});

gulp.task('watch', ['browserSync', 'sass'], function(){
	gulp.watch('src/scss/**/*.scss', ['sass']);
	gulp.watch('src/html/**/*.html', browserSync.reload);
	gulp.watch('src/js/**/*.js', browserSync.reload);
});

gulp.task('browserSync', function(){
	browserSync.init({
		server: {
			baseDir: 'src'
		}
	})
});

gulp.task('clean:dist', function(){
	return del.sync('dist');
});

gulp.task("buildjs", function () {
    return gulp.src(["src/js/**/jquery.min.js", "src/js/**/angular.min.js", "src/js/**/angular.min.js", "src/js/**/app.js", "src/js/**/app.js", "src/js/**/*.js"])
        .pipe(concat("weallt.min.js"))
		.pipe(uglify())
        .pipe(gulp.dest("dist"));
});

gulp.task("buildcss", function(){
	return gulp.src(["src/css/**/bootstrap.css", "src/css/**/bootstrap-theme.css", "src/css/**/*.css"])
				.pipe(concatcss("weallt.min.css"))
				.pipe(gulpIf("*.css", cssnano()))
				.pipe(gulp.dest("dist"));
});

gulp.task("build", function(){
	runSequence('clean:dist','buildjs', 'buildcss');
});