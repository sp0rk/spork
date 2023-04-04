package io.github.sp0rk.spork.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

//    @Provides
//    @Singleton
//    fun provideHttpClient(): OkHttpClient {
//        return OkHttpClient.Builder()
//            .readTimeout(20, TimeUnit.SECONDS)
//            .connectTimeout(20, TimeUnit.SECONDS)
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideRetrofitInstance(okHttpClient: OkHttpClient): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(BuildConfig.BASE_URL)
//            .client(okHttpClient)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideMovieApi(retrofit: Retrofit): MovieApi {
//        return retrofit.create(MovieApi::class.java)
//    }

}
