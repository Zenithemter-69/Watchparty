package ascending.com.ascendingg.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lascending/com/ascendingg/ui/viewmodel/AICoachViewModel;", "Landroidx/lifecycle/ViewModel;", "aiRepository", "Lascending/com/ascendingg/data/repository/AIRepository;", "(Lascending/com/ascendingg/data/repository/AIRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lascending/com/ascendingg/ui/viewmodel/ChatUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "sendMessage", "", "message", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AICoachViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final ascending.com.ascendingg.data.repository.AIRepository aiRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<ascending.com.ascendingg.ui.viewmodel.ChatUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<ascending.com.ascendingg.ui.viewmodel.ChatUiState> uiState = null;
    
    @javax.inject.Inject
    public AICoachViewModel(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.repository.AIRepository aiRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<ascending.com.ascendingg.ui.viewmodel.ChatUiState> getUiState() {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}