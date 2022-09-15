#include <iostream>
#include <set>
#include <algorithm>
using namespace std;
int main(){int elementA=7;set<int> setA={1,2,3,4,5,6,elementA,8,9,10};set<int> setB={};for(auto& el:setA){if(el<=elementA){int sizeOfSetB=setB.size();if(sizeOfSetB<4){setB.insert(el);}else{setB.clear();}}setB.erase(elementA);setB.insert(110);for(auto& elem:setB){std::cout<<elem;std::cout<<" ";}}}