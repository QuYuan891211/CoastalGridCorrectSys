<template>
	<div class="statistican-info">
		<div class="my-minor-tile">{{ minorTitle }}</div>
		<div class="my-primay-title" :style="{ color: primayColor }">{{ primayTile }}</div>
	</div>
</template>
<script lang="ts">
import { Component, Prop, Vue, Watch } from 'vue-property-decorator'
@Component({})
export default class StatisticanInfoView extends Vue {
	@Prop(String)
	minorTitle: string
	@Prop(String)
	primayTile: string
	@Prop(String)
	primayColor: string
}
</script>
<style scoped lang="less">
.statistican-info {
	height: 90%;
	width: 200px;
	background: #0a3d62;
	display: flex;
	border-radius: 10px;
	flex-direction: column;
	.my-minor-tile {
		flex-grow: 2;
		color: white;
		margin: 5px;
	}
	.my-primay-title {
		flex-grow: 8;
		color: white;
		display: flex;
		justify-content: center;
		align-items: center;
		font-size: 30px;
	}
}
</style>
