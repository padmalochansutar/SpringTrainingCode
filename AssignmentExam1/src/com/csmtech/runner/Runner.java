package com.csmtech.runner;

import java.io.IOException;

import com.csmtech.FileIo;

public class Runner {

	public static void main(String[] args) {
		
				FileIo qn4FileIo = new FileIo();
				try {
					qn4FileIo.fileCopy("testone.txt","testtwo.txt");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

