package id.kardihaekal.myfriends.Interface;

import id.kardihaekal.myfriends.Friends;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("get_friends.php")
    Call<List<Friends>> getFriends();

    @FormUrlEncoded
    @POST("add_friend.php")
    Call<Friends> insertFriend(
            @Field("key") String key,
            @Field("nama") String nama,
            @Field("hobi") String hobi,
            @Field("profesi") String profesi,
            @Field("kelamin") int kelamin,
            @Field("birth") String birth,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("update_friend.php")
    Call<Friends> updateFriend(
            @Field("key") String key,
            @Field("id") int id,
            @Field("nama") String nama,
            @Field("hobi") String hobi,
            @Field("profesi") String profesi,
            @Field("kelamin") int kelamin,
            @Field("birth") String birth,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("delete_friend.php")
    Call<Friends> deleteFriend(
            @Field("key") String key,
            @Field("id") int id,
            @Field("picture") String picture);

    /*@FormUrlEncoded
    @POST("delete_friend.php")
    Call<Friends> deleteFriend(@Field("id") int id);*/

}
