#include <iostream>
#include <set>
#include <algorithm>
using namespace std;
int getNextElementOfSet(set<int> someSet,int previousElement){int resultElement=-1;int elementA=0;auto condition=0;for(auto& el:someSet){if(el==previousElement){condition=1;}else{if(condition>0){resultElement=el;condition=0;}}}return resultElement;}int main(){int elementA=5;int elementB=785;set<int> setA={1,2,elementA,7,elementB};for(auto& el:setA){std::cout<<el;std::cout<<" ";}std::cout<<"\n";int el=45;int nonElement=-1;int afterA=getNextElementOfSet(setA,elementA);int afterB=getNextElementOfSet(setA,elementB);while(afterA!=nonElement){std::cout<<elementA;std::cout<<" next -> ";std::cout<<afterA;std::cout<<"\n";elementA=afterA;afterA=getNextElementOfSet(setA,elementA);}if(afterB==nonElement){std::cout<<"done";}else{std::cout<<"error";}}