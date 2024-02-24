class Solution {
public:
    #define ppr pair<int, int>
    vector<int> findAllPeople(int n, vector<vector<int>>& meetings, int firstPerson) {

        // ab graph to bnana padega n \U0001f972\U0001f972
        // tabhi aage kuchch kar payenge
        vector<pair<int,int>> adj[n];
        for (auto it : meetings) {

            // dekho undirected graph bna rha thik
            // lekin ek minute...(carry minati \U0001f602)
            // kyu abhi bhai
            // arey meeting hai n
            // chahe x y se kre ya y x se baat to same hi hai
            // arey tum apni GF/BF se baat kro ya phir vo tumse
            // baat to ho rhi hai n
            // flow bidirectional huaa n...Bas (\U0001f937‍♂️)
            // dekho bhai bhatkna nhi hai..abhi approach samjho..
            adj[it[0]].push_back({it[1],it[2]});
            adj[it[1]].push_back({it[0],it[2]});
        }

        // dekho minPQ ye ensure krega, ki us 
        // person ko pehle secret pta chale,
        // jiska meet wala time minimum ho

        // ye n thoda sa confusion wala step hai 
        // but kosis karta hu ki, samjha paau..
        // bas confusion ho to, comment krna ya phir 
        // copy pe chal ke dekhna
        // feel ho jayega

        // \U0001f525\U0001f525\U0001f525\U0001f525\U0001f525\U0001f525\U0001f525\U0001f525

        // aaiye explain karta hu..dhyan dena...ab serious hu main

        // dekho (x->y) ke beech meet multiple time hogi thik
        // to ham us multiple time mese 
        // jabse minimum time ka use krenge jisme,
        // use secret pta chal paye 
        // kyuki, agle wale ko tabhi secret pta chalega
        // jab uska time pichchale wale se bda ya baraber hoga

        // suppose t(curr_time), time(prev_secret_time)

        // agle bande ko tabhi secret pta chalega jab 
        // t>=time 

        // socho mai,tum aur tumhara ek aur dost hai 

        // mai tumse ek baat btata hu aur bolta hu
        // dusare dost ko btane ke liye
        // socho, tum mere baad usse miloge tabhi n usko pta paoge ki
        // maine kya bola tha...

        // isiliye, jitna jaldi ho ske utna kam time me tum
        // mere se miloge taki, meri baat aage bta paao..

        // i think feel huaa hoga
        // nhi huaa, koi baat nhi..comment 
        // kro...mai hu n, feel krane ke liye 

        // minPQ
        priority_queue<ppr, vector<ppr>, greater<ppr> > pq;
        pq.push({0, 0});
        pq.push({0, firstPerson});

        vector<int> vis(n, 0);

        while (!pq.empty()) {

            // value nikala hmne queue se
            auto it = pq.top();
            int time=it.first; 
            int person=it.second;
            pq.pop();

            // dekho agr koi person
            // pehle se secret janta hai 
            // yani to use ab bta ke koi fayda nhi

            // thik n, achcha abhi bhai tum kaise keh skte ho
            // vo pehle hi janta hoga

            // kyuki hmne minPQ bnaya hai, to minimum time
            // top pe hai and agr vo visited hai yani
            // pehle hi use kisi ne vo baat bta di thi..


            // socho mai tumhe que abhi explain kr rha hu..
            // tumhe to abhi pta chal gya

            // ab koi tumhe ye secret shaam ko bta rha hai to
            // koi fayda nhi n...

            // simple hai..
            if (vis[person]) {
                continue;
            }
            vis[person] = true;
            for (auto it : adj[person]) {
                
                // agr person visited nhi hai and use baat 
                // prev_secret_time se jayda ya barabar hai

                // to use baat to pta chalegi hi..
                // simple hai ✅✅

                // ese n vo multiple edge wala bhi cover ho jayega
                // ye line nhi samjh aai to comment krna bta dunga..

                // arey 10 min aur hi lagega type hi kar deta hu..

                // itna to mai kar hi skta h


                // dekho adj list bnate time, ham sab edge push 
                // push kar rhe the, to same ke beech multiple
                // edge push hui hogi,
                // jab es loop se bahar nikal rhe hai..
                // vo sabhi multiple edge bahar aa rhi hai

                // saari edge push to ho rhi hai
                // jo curr_time>=pre_time
                // vo wali node

                // lekin jo es situation me minimum hoga 
                // vhi top pe hogam vhi visited kar dege,
                // baki ka kam padega hi nhi
                // vo conintue wale case se mud jayenge 

                // arey vhi baat hai..jab apko
                // apka dost reel bhejta hai aur aap bolte hai
                // chal chal pehle se dekh hai \U0001f602\U0001f602\U0001f602

                // hawa aane de..\U0001f923
                if (!vis[it.first] && it.second >= time) {
                    pq.push({it.second, it.first});
                }
            }
        }

        // jo jo visites hoga
        // use secret pta chala hoga
        // vhi answer hi hoga
        vector<int> ans;
        for (int i = 0; i < n; ++i) {
            if (vis[i]) {
                ans.push_back(i);
            }
        }

        // return kro mje lo...
        // lekin jaate jaate ek baat kahunga
        // Har que game hai..load mat lo...maje me Game ki 
        //ctarah lo...kuchch hard, easy , medium nhi hota..

        // que ko feel krna bahot imp hai

        // milta hu next post me..❤️❤️

        // Happy Coding \U0001f60a\U0001f60a\U0001f60a
        return ans;
    }
};