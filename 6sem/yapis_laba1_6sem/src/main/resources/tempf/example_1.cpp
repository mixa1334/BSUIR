#include <iostream>
#include <set>
#include <algorithm>
using namespace std;
void showTwoSets(set<int> A,set<int> B){for(auto& elementA:A){std::cout<<elementA;std::cout<<" ";}std::cout<<"\n";for(auto& elementB:B){std::cout<<elementB;std::cout<<" ";}std::cout<<"\n----------\n";}void showOneSet(set<int> someSet){for(auto& el:someSet){std::cout<<el;std::cout<<" ";}std::cout<<"\n";}int main(){set<int> setA={1,2,3,4,5};set<int> setB={1,2,3,4,5,78,555};std::cout<<"set A and set B -> \n";showTwoSets(setA,setB);set<int> setC;set_difference(setA.begin(), setA.end(), setB.begin(), setB.end() , inserter(setC, setC.begin()));std::cout<<"difference of A and B -> ";showOneSet(setC);int elementA=45;int elementB=99;int elementC=120;setC.insert(elementA);setC.insert(elementB);setC.insert(elementC);std::cout<<"set C -> ";showOneSet(setC);setC;set_union(setC.begin(), setC.end(), setA.begin(), setA.end() , inserter(setC, setC.begin()));std::cout<<"C after union with A -> ";showOneSet(setC);set<int> setD;set_symmetric_difference(setC.begin(), setC.end(), setB.begin(), setB.end() , inserter(setD, setD.begin()));std::cout<<"symmetric difference of C and B -> ";showOneSet(setD);}