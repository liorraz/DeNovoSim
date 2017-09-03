DeNovo zsim
====
A zsim implementation which uses DeNovo Cache Coherence protocal, instead of the original MESI protocol.

End Project for TAU course 0368418301 - Advanced Topics in Multicore Architecture and Software Systems


Lecturer: Adam Morrison

Student: Lior Raz

Compile & Run: regularly, like zsim *only with linux OS kernal 3.x:
1. Install 
```bash
     a. git clone https://github.com/liorraz/DeNovoSim.git
     b. cd DeNovoSim/deNovoZSim/
     c. setenv PINPATH /usr/local/lib/pin-2.14-71313-gcc.4.4.7-linux
     d. scons -j16
```	 
2. Test it:
```bash
     a. build/opt/zsim tests/simple.cfg 
	 or
		build/opt/zsim tests/ptree.cfg 
```
	 
Note:
	some of the implementation and properties were commented out from the original code, since their usage of MESI protocol.