class Solution {
  public:
    void isBFS(unordered_map<int,vector<int>> adj,int u,vector<bool>& visited,vector<int>& result){
        queue<int> que;
        que.push(u);
        
        visited[u]=true;
        
        result.push_back(u);
        
        while(!que.empty()){
            int u=que.front();
            que.pop();
            
            for(int &v: adj[u]){
                if(!visited[v]){
                    que.push(v);
                    visited[v]=true;
                    result.push_back(v);
                }
            }
        }
    }
    vector<int> bfs(vector<vector<int>> &mp) {
        // code here
        int V=mp.size();
        unordered_map<int,vector<int>> adj;
        
        vector<bool> visited(V,false);
        vector<int> result;
        
        for(int i=0;i<V;i++){
            for(auto v=mp[i].begin();v!=mp[i].end();v++){
                adj[i].push_back(*v);
            }
        }
        
        isBFS(adj,0,visited,result);
        
        return result;
    }
};
