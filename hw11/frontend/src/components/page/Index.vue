<template>
    <div>
        <Post v-for="post in posts" :post="post" :key="post.id"/>
    </div>
</template>

<script>


import Post from "@/components/page/Post.vue";

export default {
    name: "Index",
    components: {Post},
    props: ["posts"],
    methods: {
        postComments: function (postId) {
            return Object.values(this.comments).filter(comment => comment.postId === postId);
        }
    }
}
</script>

<style scoped>

</style>
