package com.test.git;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("created new class to test git pull");
		System.out.println("new change");
		System.out.println("DEV branch switched and added line");

		//will try to add some changes at gitHub and pull
		//for not just stash this
		//since I`m in dev branch now I should see changes in the code when pull

		//comment from gitHub
		System.out.println("eclipse say no changes, wierd");
		System.out.println("not wierd at all, you were in master branch, but pulling from DEV");
		
		//both branches merged successfully
		System.err.println("GitHub doesn't see changed between 2 branches");

	}
}
