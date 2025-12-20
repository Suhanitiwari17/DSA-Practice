class Solution {
  public:
    void isDFS(unordered_map<int,vector<int>> &adj,int u,vector<bool>& visited,vector<int>& result){
        if(visited[u]==true){
            return;
        }
        visited[u]=true; 
        result.push_back(u);
        
        for(int &v:adj[u]){
            if(!visited[v]){
                isDFS(adj,v,visited,result);
            }
        }
        
    }
    vector<int> dfs(vector<vector<int>>& mp) {
        // Code here
        int V=mp.size();
        
        unordered_map<int,vector<int>> adj;
        
        vector<bool> visited(V,false);
        vector<int> result;
        
        for(int i=0;i<V;i++){
            for(auto v=mp[i].begin();v!=mp[i].end();v++){
                adj[i].push_back(*v);
                
            }
        }
        
        isDFS(adj,0,visited,result);
        
        return result;
    }
};
