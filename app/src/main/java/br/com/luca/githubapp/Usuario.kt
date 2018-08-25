package br.com.luca.githubapp


import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

data class Usuario(
        @SerializedName("name")
        val nome: String,
        @SerializedName("avatar_url")
        val avatarUrl: String)

    interface GitHubService {

        @GET("/users/{Luusantos}")
        fun buscarUsuario(@Path("Luusantos") username: String) : Call<Usuario>
    }