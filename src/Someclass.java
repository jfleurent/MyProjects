import java.util.ArrayList;
import java.util.Random;

public class Someclass {

  public static void main(String[] args) {
 
    int[][] board = new int[9][9];
    Random rand = new Random();
    int number = 0;
    boolean checkerV = false;
    boolean checkerB = false;
    int randomizer = 0;
    int randomTwo = 0;
    int randomThree = 0;
    int randomFour = 0;
    int[][] otherBoard = new int[9][9];
    ArrayList<Integer> numListOne = new ArrayList<Integer>();
    ArrayList<Integer> numList = new ArrayList<Integer>();
    int[] numListTwo = { 1, 2 };
    int[] numListThree = { 0, 2 };
    int[] numListFour = { 0, 1 };
    int[] numListFive = { 0, 1, 2 };
    int[] numListSix = { 3, 4, 5 };
    int[] numListSeven = { 6, 7, 8 };
    boolean oppositeOption = false;
    boolean numberIn = false;
    boolean badBoard = true;
    int tryNum = 0;

    
    numListOne.add(1);
    numListOne.add(2);
    numListOne.add(3);
    numListOne.add(4);
    numListOne.add(5);
    numListOne.add(6);
    numListOne.add(7);
    numListOne.add(8);
    numListOne.add(9);

    
    while (badBoard == true) {
      tryNum = 0;

      
      board = new int[9][9];

      for (int b = 0; b < 9; b++) {

      
        if (numListOne.size() == 0) {
          numListOne.add(1);
          numListOne.add(2);
          numListOne.add(3);
          numListOne.add(4);
          numListOne.add(5);
          numListOne.add(6);
          numListOne.add(7);
          numListOne.add(8);
          numListOne.add(9);
        }

        for (int c = 0; c < 9; c++) {

   
          if (c < 9 && b == 0) {

            
            if (numListOne.size() - 1 != 0) {
              randomizer = rand.nextInt(numListOne.size());
              
            } else if (numListOne.size() - 1 == 0) {
              randomizer = 0;
            }
            
           
            number = numListOne.get(randomizer);
            numListOne.remove(randomizer);
            board[b][c] = number;

           
            if (c < 3) {
              
             
              randomTwo = rand.nextInt(2);
              
              
              if (numListTwo[randomTwo] == 1) {
                
              
                
              
                if (randomFour == 0) {
                  numberIn = false;
                  
                 
                  while (numberIn == false) {
                    
               
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSix[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSix[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }
                  
                 
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[2][numListSeven[randomThree]] == 0) {
                      board[2][numListSeven[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }
               
                } else if (randomFour == 1) {
                  numberIn = false;
                  
                 
                  while (numberIn == false) {
                    
               
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSeven[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSeven[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }
                  
               
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[2][numListSix[randomThree]] == 0) {
                      board[2][numListSix[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }
                }
                
                
              } else if (numListTwo[randomTwo] == 2) {
                
             
                randomFour = rand.nextInt(2);
                
                
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSeven[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSeven[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[1][numListSix[randomThree]] == 0) {
                      board[1][numListSix[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSix[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSix[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[1][numListSeven[randomThree]] == 0) {
                      board[1][numListSeven[randomThree]] = board[b][c];
                      numberIn = true;
                    }
                  }

                }
              }

            } else if (c >= 3 && c < 6) {
              oppositeOption = false;
              if (board[2][6] != 0 && board[2][7] != 0 && board[2][8] != 0) {
                randomTwo = 1;
              } else if (board[1][6] != 0 && board[1][7] != 0 && board[1][8] != 0) {
                randomTwo = 0;
              } else {
                randomTwo = rand.nextInt(2);
              }
              if (numListTwo[randomTwo] == 1) {
                randomFour = rand.nextInt(2);
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListFive[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListFive[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListFive[0]] != 0
                        && board[numListTwo[randomTwo]][numListFive[1]] != 0
                        && board[numListTwo[randomTwo]][numListFive[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[2][numListFive[randomThree]] == 0) {
                          board[2][numListFive[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListSeven[randomThree]] == 0) {
                        board[2][numListSeven[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListSeven[randomThree]] == 0) {
                        board[1][numListSeven[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSeven[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSeven[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListSeven[0]] != 0
                        && board[numListTwo[randomTwo]][numListSeven[1]] != 0
                        && board[numListTwo[randomTwo]][numListSeven[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[2][numListSeven[randomThree]] == 0) {
                          board[2][numListSeven[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListFive[randomThree]] == 0) {
                        board[2][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListFive[randomThree]] == 0) {
                        board[1][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                }
              } else if (numListTwo[randomTwo] == 2) {
                randomFour = rand.nextInt(2);
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSeven[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSeven[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListSeven[0]] != 0
                        && board[numListTwo[randomTwo]][numListSeven[1]] != 0
                        && board[numListTwo[randomTwo]][numListSeven[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[1][numListSeven[randomThree]] == 0) {
                          board[1][numListSeven[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListFive[randomThree]] == 0) {
                        board[1][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListFive[randomThree]] == 0) {
                        board[2][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListFive[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListFive[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListFive[0]] != 0
                        && board[numListTwo[randomTwo]][numListFive[1]] != 0
                        && board[numListTwo[randomTwo]][numListFive[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[1][numListFive[randomThree]] == 0) {
                          board[1][numListFive[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListSeven[randomThree]] == 0) {
                        board[1][numListSeven[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }

                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListSeven[randomThree]] == 0) {
                        board[2][numListSeven[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                }
              }

            } else if (c >= 6) {
              oppositeOption = false;
              randomTwo = rand.nextInt(2);
              if (numListTwo[randomTwo] == 1) {
                randomFour = rand.nextInt(2);
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListFive[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListFive[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListFive[0]] != 0
                        && board[numListTwo[randomTwo]][numListFive[1]] != 0
                        && board[numListTwo[randomTwo]][numListFive[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[2][numListFive[randomThree]] == 0) {
                          board[2][numListFive[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListSix[randomThree]] == 0) {
                        board[2][numListSix[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListSix[randomThree]] == 0) {
                        board[1][numListSix[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSix[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSix[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListSix[0]] != 0
                        && board[numListTwo[randomTwo]][numListSix[1]] != 0
                        && board[numListTwo[randomTwo]][numListSix[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[2][numListSix[randomThree]] == 0) {
                          board[2][numListSix[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListFive[randomThree]] == 0) {
                        board[2][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListFive[randomThree]] == 0) {
                        board[1][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              } else if (numListTwo[randomTwo] == 2) {
                randomFour = rand.nextInt(2);
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListSix[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListSix[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListSix[0]] != 0
                        && board[numListTwo[randomTwo]][numListSix[1]] != 0
                        && board[numListTwo[randomTwo]][numListSix[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[1][numListSix[randomThree]] == 0) {
                          board[1][numListSix[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListFive[randomThree]] == 0) {
                        board[1][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListFive[randomThree]] == 0) {
                        board[2][numListFive[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListTwo[randomTwo]][numListFive[randomThree]] == 0) {
                      board[numListTwo[randomTwo]][numListFive[randomThree]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListTwo[randomTwo]][numListFive[0]] != 0
                        && board[numListTwo[randomTwo]][numListFive[1]] != 0
                        && board[numListTwo[randomTwo]][numListFive[2]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[1][numListFive[randomThree]] == 0) {
                          board[1][numListFive[randomThree]] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[1][numListSix[randomThree]] == 0) {
                        board[1][numListSix[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }

                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[2][numListSix[randomThree]] == 0) {
                        board[2][numListSix[randomThree]] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              }

            }
          }

        }
      }
      for (int b = 0; b < 9; b++) {
        for (int c = 0; c < 9; c++) {
          if (b < 3 && c < 3) {
            if (c == 0) {
              oppositeOption = false;

              if (board[6][2] != 0 && board[7][2] != 0 && board[8][2] != 0) {
                randomTwo = 1;
              } else if (board[6][1] != 0 && board[7][1] != 0 && board[8][1] != 0) {
                randomTwo = 0;
              } else {
                randomTwo = rand.nextInt(2);
              }
              if (numListTwo[randomTwo] == 2) {
                if (board[3][2] != 0 && board[4][2] != 0 && board[5][2] != 0) {
                  randomFour = 0;
                } else if (board[3][1] != 0 && board[4][1] != 0 && board[5][1] != 0) {
                  randomFour = 1;
                } else {
                  randomFour = rand.nextInt(2);
                }
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSeven[randomThree]][numListTwo[randomTwo]] == 0) {
                      board[numListSeven[randomThree]][numListTwo[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSeven[0]][numListTwo[randomTwo]] != 0
                        && board[numListSeven[1]][numListTwo[randomTwo]] != 0
                        && board[numListSeven[2]][numListTwo[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSeven[randomThree]][1] == 0) {
                          board[numListSeven[randomThree]][1] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][1] == 0) {
                        board[numListSix[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][2] == 0) {
                        board[numListSix[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSix[randomThree]][numListTwo[randomTwo]] == 0) {
                      board[numListSix[randomThree]][numListTwo[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSix[0]][numListTwo[randomTwo]] != 0
                        && board[numListSix[1]][numListTwo[randomTwo]] != 0
                        && board[numListSix[2]][numListTwo[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSix[randomThree]][1] == 0) {
                          board[numListSix[randomThree]][1] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][1] == 0) {
                        board[numListSeven[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][2] == 0) {
                        board[numListSeven[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              } else if (numListTwo[randomTwo] == 1) {
                if (board[3][2] != 0 && board[4][2] != 0 && board[5][2] != 0) {
                  randomFour = 0;
                } else if (board[3][1] != 0 && board[4][1] != 0 && board[5][1] != 0) {
                  randomFour = 1;
                } else {
                  randomFour = rand.nextInt(2);
                }
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSix[randomThree]][numListTwo[randomTwo]] == 0) {
                      board[numListSix[randomThree]][numListTwo[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSix[0]][numListTwo[randomTwo]] != 0
                        && board[numListSix[1]][numListTwo[randomTwo]] != 0
                        && board[numListSix[2]][numListTwo[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSix[randomThree]][2] == 0) {
                          board[numListSix[randomThree]][2] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][2] == 0) {
                        board[numListSeven[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][1] == 0) {
                        board[numListSeven[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSeven[randomThree]][numListTwo[randomTwo]] == 0) {
                      board[numListSeven[randomThree]][numListTwo[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSeven[0]][numListTwo[randomTwo]] != 0
                        && board[numListSeven[1]][numListTwo[randomTwo]] != 0
                        && board[numListSeven[2]][numListTwo[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSeven[randomThree]][2] == 0) {
                          board[numListSeven[randomThree]][2] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][2] == 0) {
                        board[numListSix[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }

                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][1] == 0) {
                        board[numListSix[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              }
            } else if (c == 1) {
              oppositeOption = false;

              if (board[6][2] != 0 && board[7][2] != 0 && board[8][2] != 0) {
                randomTwo = 1;
              } else if (board[6][0] != 0 && board[7][0] != 0 && board[8][0] != 0) {
                randomTwo = 0;
              } else {
                randomTwo = rand.nextInt(2);
              }
              if (numListThree[randomTwo] == 2) {
                if (board[3][2] != 0 && board[4][2] != 0 && board[5][2] != 0) {
                  randomFour = 0;
                } else if (board[3][0] != 0 && board[4][0] != 0 && board[5][0] != 0) {
                  randomFour = 1;
                } else {
                  randomFour = rand.nextInt(2);
                }
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSeven[randomThree]][numListThree[randomTwo]] == 0) {
                      board[numListSeven[randomThree]][numListThree[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSeven[0]][numListThree[randomTwo]] != 0
                        && board[numListSeven[1]][numListThree[randomTwo]] != 0
                        && board[numListSeven[2]][numListThree[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSeven[randomThree]][0] == 0) {
                          board[numListSeven[randomThree]][0] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][0] == 0) {
                        board[numListSix[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][2] == 0) {
                        board[numListSix[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSix[randomThree]][numListThree[randomTwo]] == 0) {
                      board[numListSix[randomThree]][numListThree[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSix[0]][numListThree[randomTwo]] != 0
                        && board[numListSix[1]][numListThree[randomTwo]] != 0
                        && board[numListSix[2]][numListThree[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSix[randomThree]][0] == 0) {
                          board[numListSix[randomThree]][0] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][0] == 0) {
                        board[numListSeven[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][2] == 0) {
                        board[numListSeven[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              } else if (numListThree[randomTwo] == 0) {
                if (board[3][2] != 0 && board[4][2] != 0 && board[5][2] != 0) {
                  randomFour = 0;
                } else if (board[3][0] != 0 && board[4][0] != 0 && board[5][0] != 0) {
                  randomFour = 1;
                } else {
                  randomFour = rand.nextInt(2);
                }
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSix[randomThree]][numListThree[randomTwo]] == 0) {
                      board[numListSix[randomThree]][numListThree[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSix[0]][numListThree[randomTwo]] != 0
                        && board[numListSix[1]][numListThree[randomTwo]] != 0
                        && board[numListSix[2]][numListThree[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSix[randomThree]][2] == 0) {
                          board[numListSix[randomThree]][2] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][2] == 0) {
                        board[numListSeven[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][0] == 0) {
                        board[numListSeven[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSeven[randomThree]][numListThree[randomTwo]] == 0) {
                      board[numListSeven[randomThree]][numListThree[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSeven[0]][numListThree[randomTwo]] != 0
                        && board[numListSeven[1]][numListThree[randomTwo]] != 0
                        && board[numListSeven[2]][numListThree[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSeven[randomThree]][2] == 0) {
                          board[numListSeven[randomThree]][2] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][2] == 0) {
                        board[numListSix[randomThree]][2] = board[b][c];
                        numberIn = true;
                      }
                    }

                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][0] == 0) {
                        board[numListSix[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              }

            } else if (c == 2) {
              oppositeOption = false;
              if (board[6][1] != 0 && board[7][1] != 0 && board[8][1] != 0) {
                randomTwo = 1;
              } else if (board[6][0] != 0 && board[7][0] != 0 && board[8][0] != 0) {
                randomTwo = 0;
              } else {
                randomTwo = rand.nextInt(2);
              }
              if (numListFour[randomTwo] == 1) {
                if (board[3][0] != 0 && board[4][0] != 0 && board[5][0] != 0) {
                  randomFour = 1;
                } else if (board[3][1] != 0 && board[4][1] != 0 && board[5][1] != 0) {
                  randomFour = 0;
                } else {
                  randomFour = rand.nextInt(2);
                }
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSeven[randomThree]][numListFour[randomTwo]] == 0) {
                      board[numListSeven[randomThree]][numListFour[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSeven[0]][numListFour[randomTwo]] != 0
                        && board[numListSeven[1]][numListFour[randomTwo]] != 0
                        && board[numListSeven[2]][numListFour[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSeven[randomThree]][0] == 0) {
                          board[numListSeven[randomThree]][0] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][0] == 0) {
                        board[numListSix[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][1] == 0) {
                        board[numListSix[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }

                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSix[randomThree]][numListFour[randomTwo]] == 0) {
                      board[numListSix[randomThree]][numListFour[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSix[0]][numListFour[randomTwo]] != 0
                        && board[numListSix[1]][numListFour[randomTwo]] != 0
                        && board[numListSix[2]][numListFour[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSix[randomThree]][0] == 0) {
                          board[numListSix[randomThree]][0] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][0] == 0) {
                        board[numListSeven[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][1] == 0) {
                        board[numListSeven[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              } else if (numListFour[randomTwo] == 0) {
                if (board[3][0] != 0 && board[4][0] != 0 && board[5][0] != 0) {
                  randomFour = 1;
                } else if (board[3][1] != 0 && board[4][1] != 0 && board[5][1] != 0) {
                  randomFour = 0;
                } else {
                  randomFour = rand.nextInt(2);
                }
                if (randomFour == 0) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSix[randomThree]][numListFour[randomTwo]] == 0) {
                      board[numListSix[randomThree]][numListFour[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSix[0]][numListFour[randomTwo]] != 0
                        && board[numListSix[1]][numListFour[randomTwo]] != 0
                        && board[numListSix[2]][numListFour[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSix[randomThree]][1] == 0) {
                          board[numListSix[randomThree]][1] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][1] == 0) {
                        board[numListSeven[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }
                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSeven[randomThree]][0] == 0) {
                        board[numListSeven[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                } else if (randomFour == 1) {
                  numberIn = false;
                  while (numberIn == false) {
                    randomThree = rand.nextInt(3);
                    if (board[numListSeven[randomThree]][numListFour[randomTwo]] == 0) {
                      board[numListSeven[randomThree]][numListFour[randomTwo]] = board[b][c];
                      numberIn = true;
                    } else if (board[numListSeven[0]][numListFour[randomTwo]] != 0
                        && board[numListSeven[1]][numListFour[randomTwo]] != 0
                        && board[numListSeven[2]][numListFour[randomTwo]] != 0) {
                      numberIn = false;
                      while (numberIn == false) {
                        randomThree = rand.nextInt(3);
                        if (board[numListSeven[randomThree]][1] == 0) {
                          board[numListSeven[randomThree]][1] = board[b][c];
                          numberIn = true;
                          oppositeOption = true;
                        }
                      }

                    }
                  }
                  if (oppositeOption == false) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][1] == 0) {
                        board[numListSix[randomThree]][1] = board[b][c];
                        numberIn = true;
                      }
                    }

                  } else if (oppositeOption == true) {
                    numberIn = false;
                    while (numberIn == false) {
                      randomThree = rand.nextInt(3);
                      if (board[numListSix[randomThree]][0] == 0) {
                        board[numListSix[randomThree]][0] = board[b][c];
                        numberIn = true;
                      }
                    }
                  }
                }
              }
            }
          } else if (b > 2 && c > 2) {
            break;
          }
        }
      }
      for (int b = 3; b < 9; b++) {
        if (tryNum == 30) {
          b = 3;
          resetBoard(board);

        }
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList = createNewList(b, board, numList);
        tryNum = 0;

        while (otherBoard[b][8] == 0 || otherBoard[b][7] == 0 || otherBoard[b][6] == 0 || otherBoard[b][5] == 0
            || otherBoard[b][4] == 0 || otherBoard[b][3] == 0) {
          if (numList.size() == 0) {
            numList.add(1);
            numList.add(2);
            numList.add(3);
            numList.add(4);
            numList.add(5);
            numList.add(6);
            numList.add(7);
            numList.add(8);
            numList.add(9);
            numList = createNewList(b, board, numList);

          }
          otherBoard = board;
          otherBoard[b][3] = 0;
          otherBoard[b][4] = 0;
          otherBoard[b][5] = 0;
          otherBoard[b][6] = 0;
          otherBoard[b][7] = 0;
          otherBoard[b][8] = 0;
          otherBoard = generateRow(otherBoard, checkerV, checkerB, numList, randomizer, b, number, rand);
          tryNum++;
          if (tryNum == 30) {
            badBoard = true;
            break;
          }
        }

        board = otherBoard;
        if (tryNum != 30) {
          badBoard = false;
        }
      }
    }

    for (int b = 0; b < 9; b++) {
      System.out.println();
      for (int c = 0; c < 9; c++) {
        if (board[b][c] == 0) {
          System.out.print("  ");
        } else {
          System.out.print(" " + board[b][c]);
        }
      }
    }

  }

  public static void resetBoard(int[][] board) {
    for (int a = 3; a < 9; a++) {
      for (int b = 3; b < 9; b++) {
        board[a][b] = 0;
      }
    }
  }

  public static ArrayList<Integer> createNewList(int b, int[][] board, ArrayList<Integer> numList) {
    for (int a = 0; a < 3; a++) {
      int number = board[b][a];
      for (int d = 0; d < numList.size(); d++) {
        if (number == numList.get(d)) {
          numList.remove(d);
          break;
        }
      }
    }

    return numList;
  }

  public static int[][] generateRow(int[][] otherBoard, boolean checkerV, boolean checkerB, ArrayList<Integer> numList,
      int randomizer, int b, int number, Random rand) {
    int[][] thisBoard = otherBoard;
    ArrayList<Integer> thisList = numList;
    for (int c = 3; c < 9; c++) {
      int counter = 0;
      while (checkerV == false || checkerB == false) {
        if (thisList.size() == 0) {
          break;
        } else if (thisList.size() - 1 != 0) {
          randomizer = rand.nextInt(thisList.size());
        } else if (thisList.size() - 1 == 0) {
          randomizer = 0;
        }
        number = thisList.get(randomizer);
        checkerV = checkVertical(c, otherBoard, number, checkerV);
        checkerB = checkBox(b, c, otherBoard, number, checkerB);
        counter++;
        if (checkerV == true && checkerB == true && thisList.size() != 0) {
          thisBoard[b][c] = number;
          thisList.remove(randomizer);
          checkerB = false;
          checkerV = false;
          break;
        } else if (counter == 12) {
          break;
        }
      }
    }
    return thisBoard;
  }

  public static boolean checkVertical(int b, int[][] board, int number, boolean checkerV) {
    ArrayList<Integer> verticalArray = new ArrayList<Integer>();
    for (int c = 0; c < 9; c++) {
      verticalArray.add(board[c][b]);
    }
    for (int d = 0; d < verticalArray.size(); d++) {
      if (number != verticalArray.get(d)) {
        checkerV = true;
      } else if (number == verticalArray.get(d)) {
        checkerV = false;
        break;
      }
    }
    return checkerV;

  }

  public static boolean checkBox(int a, int b, int[][] board, int number, boolean checkerB) {
    ArrayList<Integer> boxArray = new ArrayList<Integer>();
    if (a <= 2 && b <= 2) {
      for (int c = 0; c < 3; c++) {
        for (int f = 0; f < 3; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }
      }

    } else if (a <= 2 && b > 2 && b <= 5) {
      for (int c = 0; c < 3; c++) {
        for (int f = 3; f < 6; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }

      }
    } else if (a <= 2 && b > 5 && b <= 8) {
      for (int c = 0; c < 3; c++) {
        for (int f = 6; f < 9; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }
      }

    } else if (a > 2 && a <= 5 && b <= 2) {
      for (int c = 3; c < 6; c++) {
        for (int f = 0; f < 3; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }

      }
    } else if (a > 2 && a <= 5 && b > 2 && b <= 5) {
      for (int c = 3; c < 6; c++) {
        for (int f = 3; f < 6; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }

      }

    } else if (a > 2 && a <= 5 && b > 5 && b <= 8) {
      for (int c = 3; c < 6; c++) {
        for (int f = 6; f < 9; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }

      }

    } else if (a > 5 && a <= 8 && b <= 2) {
      for (int c = 6; c < 9; c++) {
        for (int f = 0; f < 3; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }

      }

    } else if (a > 5 && a <= 8 && b > 2 && b <= 5) {
      for (int c = 6; c < 9; c++) {
        for (int f = 3; f < 6; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }

      }

    } else if (a > 5 && a <= 8 && b > 5 && b <= 8) {
      for (int c = 6; c < 9; c++) {
        for (int f = 6; f < 9; f++) {
          boxArray.add(board[c][f]);
        }

      }
      for (int d = 0; d < boxArray.size(); d++) {
        if (number != boxArray.get(d)) {
          checkerB = true;
        } else if (number == boxArray.get(d)) {
          checkerB = false;
          break;
        }

      }

    }

    return checkerB;
  }

}
