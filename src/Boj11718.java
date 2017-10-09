/*
 * Copyright 2017 jihye hwang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Created by jihye on 2017-10-02
 * Site       : https://www.acmicpc.net/problem/11718
 */

import java.util.*;

public class Boj11718 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String moon[] = new String[100];

        for(int i=0; i<100; i++) { //입력은 최대 100줄.
            String line = sc.nextLine();
            int num = line.length();
                if (num > 100 || line.isEmpty() || line.charAt(0) == ' ' || line.charAt(num-1) == ' ') { //각 줄이 100글자를 넘거나. 빈 줄이거나, 공백시작, 공백 끝이면
                    break;
                }
                else {
                    System.out.println(line);
                }
            }
        }
    }

