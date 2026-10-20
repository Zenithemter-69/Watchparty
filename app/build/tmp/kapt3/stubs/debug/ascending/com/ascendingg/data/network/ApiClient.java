package ascending.com.ascendingg.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lascending/com/ascendingg/data/network/ApiClient;", "", "()V", "BASE_URL", "", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getAiResponse", "context", "Landroid/content/Context;", "message", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetrofit", "Lretrofit2/Retrofit;", "AiApiService", "ChatMessage", "ChatRequest", "ChatResponse", "Choice", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://api.openai.com/v1/";
    private static final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull()
    public static final ascending.com.ascendingg.data.network.ApiClient INSTANCE = null;
    
    private ApiClient() {
        super();
    }
    
    private final retrofit2.Retrofit getRetrofit(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAiResponse(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lascending/com/ascendingg/data/network/ApiClient$AiApiService;", "", "chatCompletion", "Lascending/com/ascendingg/data/network/ApiClient$ChatResponse;", "body", "Lascending/com/ascendingg/data/network/ApiClient$ChatRequest;", "(Lascending/com/ascendingg/data/network/ApiClient$ChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface AiApiService {
        
        @retrofit2.http.POST(value = "chat/completions")
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object chatCompletion(@retrofit2.http.Body()
        @org.jetbrains.annotations.NotNull()
        ascending.com.ascendingg.data.network.ApiClient.ChatRequest body, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ascending.com.ascendingg.data.network.ApiClient.ChatResponse> $completion);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lascending/com/ascendingg/data/network/ApiClient$ChatMessage;", "", "role", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getRole", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class ChatMessage {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String role = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String content = null;
        
        public ChatMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String role, @org.jetbrains.annotations.NotNull()
        java.lang.String content) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRole() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ascending.com.ascendingg.data.network.ApiClient.ChatMessage copy(@org.jetbrains.annotations.NotNull()
        java.lang.String role, @org.jetbrains.annotations.NotNull()
        java.lang.String content) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lascending/com/ascendingg/data/network/ApiClient$ChatRequest;", "", "model", "", "messages", "", "Lascending/com/ascendingg/data/network/ApiClient$ChatMessage;", "max_tokens", "", "temperature", "", "(Ljava/lang/String;Ljava/util/List;ID)V", "getMax_tokens", "()I", "getMessages", "()Ljava/util/List;", "getModel", "()Ljava/lang/String;", "getTemperature", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class ChatRequest {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String model = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ascending.com.ascendingg.data.network.ApiClient.ChatMessage> messages = null;
        private final int max_tokens = 0;
        private final double temperature = 0.0;
        
        public ChatRequest(@org.jetbrains.annotations.NotNull()
        java.lang.String model, @org.jetbrains.annotations.NotNull()
        java.util.List<ascending.com.ascendingg.data.network.ApiClient.ChatMessage> messages, int max_tokens, double temperature) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ascending.com.ascendingg.data.network.ApiClient.ChatMessage> getMessages() {
            return null;
        }
        
        public final int getMax_tokens() {
            return 0;
        }
        
        public final double getTemperature() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ascending.com.ascendingg.data.network.ApiClient.ChatMessage> component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final double component4() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ascending.com.ascendingg.data.network.ApiClient.ChatRequest copy(@org.jetbrains.annotations.NotNull()
        java.lang.String model, @org.jetbrains.annotations.NotNull()
        java.util.List<ascending.com.ascendingg.data.network.ApiClient.ChatMessage> messages, int max_tokens, double temperature) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lascending/com/ascendingg/data/network/ApiClient$ChatResponse;", "", "choices", "", "Lascending/com/ascendingg/data/network/ApiClient$Choice;", "(Ljava/util/List;)V", "getChoices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class ChatResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ascending.com.ascendingg.data.network.ApiClient.Choice> choices = null;
        
        public ChatResponse(@org.jetbrains.annotations.NotNull()
        java.util.List<ascending.com.ascendingg.data.network.ApiClient.Choice> choices) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ascending.com.ascendingg.data.network.ApiClient.Choice> getChoices() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ascending.com.ascendingg.data.network.ApiClient.Choice> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ascending.com.ascendingg.data.network.ApiClient.ChatResponse copy(@org.jetbrains.annotations.NotNull()
        java.util.List<ascending.com.ascendingg.data.network.ApiClient.Choice> choices) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lascending/com/ascendingg/data/network/ApiClient$Choice;", "", "message", "Lascending/com/ascendingg/data/network/ApiClient$ChatMessage;", "finish_reason", "", "(Lascending/com/ascendingg/data/network/ApiClient$ChatMessage;Ljava/lang/String;)V", "getFinish_reason", "()Ljava/lang/String;", "getMessage", "()Lascending/com/ascendingg/data/network/ApiClient$ChatMessage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Choice {
        @org.jetbrains.annotations.NotNull()
        private final ascending.com.ascendingg.data.network.ApiClient.ChatMessage message = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String finish_reason = null;
        
        public Choice(@org.jetbrains.annotations.NotNull()
        ascending.com.ascendingg.data.network.ApiClient.ChatMessage message, @org.jetbrains.annotations.NotNull()
        java.lang.String finish_reason) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ascending.com.ascendingg.data.network.ApiClient.ChatMessage getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFinish_reason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ascending.com.ascendingg.data.network.ApiClient.ChatMessage component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ascending.com.ascendingg.data.network.ApiClient.Choice copy(@org.jetbrains.annotations.NotNull()
        ascending.com.ascendingg.data.network.ApiClient.ChatMessage message, @org.jetbrains.annotations.NotNull()
        java.lang.String finish_reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}