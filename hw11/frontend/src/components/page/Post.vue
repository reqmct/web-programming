<template>
    <article>
        <div class="title">
            <a href="#">{{ post.title }}</a>
        </div>
        <div class="information">By {{ post.user.name}}</div>
        <div class="body">{{ post.text }}</div>
        <ul class="attachment">
            <li>Announcement of <a href="#">Codeforces Round #510 (Div. 1)</a></li>
            <li>Announcement of <a href="#">Codeforces Round #510 (Div. 2)</a></li>
        </ul>
        <div class="footer">
            <div class="left">
                <img src="../../assets/img/voteup.png" title="Vote Up" alt="Vote Up"/>
                <span class="positive-score">+173</span>
                <img src="../../assets/img/votedown.png" title="Vote Down" alt="Vote Down"/>
            </div>
            <div class="right">
                <img src="../../assets/img/date_16x16.png" title="Publish Time" alt="Publish Time"/>
                2 days ago
                <img src="../../assets/img/comments_16x16.png" title="Comments" alt="Comments"/>
                <a href="#">43</a>
            </div>

            <div class="comments" v-if="showComments">
                <div class="comments-form" v-if="user">
                    <PostCommentForm :postId="post.id" :userId="user.id"/>
                </div>
                <Comment v-for="comment in post.comments" :comment="comment" :key="comment.id"/>
            </div>

        </div>

    </article>
</template>

<script>

import PostCommentForm from "@/components/singles/PostCommentForm.vue";
import Comment from "@/components/singles/Comment.vue";

export default {
    name: "Post",
    components: {Comment, PostCommentForm},
    props: ["post", "showComments", "user"]
}


</script>

<style scoped>
</style>