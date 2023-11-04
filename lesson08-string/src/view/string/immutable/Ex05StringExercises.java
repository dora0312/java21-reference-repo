package view.string.immutable;

import java.util.Arrays;

public class Ex05StringExercises {
	public static void main(String[] args) {
		String [] songs =  {
			"d:/music/somthingyoulike.mp3",
			"d:/music/somthingyoulike2.mp3",
			"d:/music/somthingyoulike3.mov"
		};
		String[] after = getMp3(songs);
		
		after = getMp3Songs(songs);
		System.out.println();
	}
	private static String[] getMp3(String[] songs) {
		String[] temp = new String[songs.length];
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].endsWith(".mp3")) {
				temp[i] = songs[i].strip().replace("d:/music/", "").strip().replace(".mp3", "");
				System.out.println("Song " + i + ". |" + temp[i] + "|");
			}
		}
		return temp;
	}
	
	private static String[] getMp3Songs(String[] songs) {
		String[] result =  new String[songs.length];
		int count = 0;
		for(String song:songs) {
			if (song.endsWith(".mp3")) {
				int lastSlashIndex = song.lastIndexOf("/");
				int lastDotIndex = song.lastIndexOf(".");
				String name =  song.substring(lastSlashIndex+1, lastDotIndex);
				result[count++] = name;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
}
  