package ascending.com.ascendingg.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel;", "Landroidx/lifecycle/ViewModel;", "habitRepository", "Lascending/com/ascendingg/data/repository/HabitRepository;", "workoutRepository", "Lascending/com/ascendingg/data/repository/WorkoutRepository;", "(Lascending/com/ascendingg/data/repository/HabitRepository;Lascending/com/ascendingg/data/repository/WorkoutRepository;)V", "habitCompletionData", "Lkotlinx/coroutines/flow/Flow;", "", "Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel$BarEntryData;", "getHabitCompletionData", "()Lkotlinx/coroutines/flow/Flow;", "studyHoursData", "Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel$LineEntryData;", "getStudyHoursData", "BarEntryData", "InsightData", "LineEntryData", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class InsightsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final ascending.com.ascendingg.data.repository.HabitRepository habitRepository = null;
    @org.jetbrains.annotations.NotNull
    private final ascending.com.ascendingg.data.repository.WorkoutRepository workoutRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData>> habitCompletionData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData>> studyHoursData = null;
    
    @javax.inject.Inject
    public InsightsViewModel(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.repository.HabitRepository habitRepository, @org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.repository.WorkoutRepository workoutRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData>> getHabitCompletionData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData>> getStudyHoursData() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel$BarEntryData;", "", "x", "", "y", "label", "", "(FFLjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getX", "()F", "getY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class BarEntryData {
        private final float x = 0.0F;
        private final float y = 0.0F;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String label = null;
        
        public BarEntryData(float x, float y, @org.jetbrains.annotations.NotNull
        java.lang.String label) {
            super();
        }
        
        public final float getX() {
            return 0.0F;
        }
        
        public final float getY() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLabel() {
            return null;
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData copy(float x, float y, @org.jetbrains.annotations.NotNull
        java.lang.String label) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u000bH\u00c6\u0003JG\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006 "}, d2 = {"Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel$InsightData;", "", "habitData", "", "Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel$BarEntryData;", "studyData", "Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel$LineEntryData;", "dateRangeStart", "", "dateRangeEnd", "photoCount", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)V", "getDateRangeEnd", "()Ljava/lang/String;", "getDateRangeStart", "getHabitData", "()Ljava/util/List;", "getPhotoCount", "()I", "getStudyData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class InsightData {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData> habitData = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData> studyData = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String dateRangeStart = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String dateRangeEnd = null;
        private final int photoCount = 0;
        
        public InsightData(@org.jetbrains.annotations.NotNull
        java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData> habitData, @org.jetbrains.annotations.NotNull
        java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData> studyData, @org.jetbrains.annotations.NotNull
        java.lang.String dateRangeStart, @org.jetbrains.annotations.NotNull
        java.lang.String dateRangeEnd, int photoCount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData> getHabitData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData> getStudyData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDateRangeStart() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDateRangeEnd() {
            return null;
        }
        
        public final int getPhotoCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        public final int component5() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.InsightData copy(@org.jetbrains.annotations.NotNull
        java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.BarEntryData> habitData, @org.jetbrains.annotations.NotNull
        java.util.List<ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData> studyData, @org.jetbrains.annotations.NotNull
        java.lang.String dateRangeStart, @org.jetbrains.annotations.NotNull
        java.lang.String dateRangeEnd, int photoCount) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lascending/com/ascendingg/ui/viewmodel/InsightsViewModel$LineEntryData;", "", "x", "", "y", "label", "", "(FFLjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getX", "()F", "getY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class LineEntryData {
        private final float x = 0.0F;
        private final float y = 0.0F;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String label = null;
        
        public LineEntryData(float x, float y, @org.jetbrains.annotations.NotNull
        java.lang.String label) {
            super();
        }
        
        public final float getX() {
            return 0.0F;
        }
        
        public final float getY() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLabel() {
            return null;
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final ascending.com.ascendingg.ui.viewmodel.InsightsViewModel.LineEntryData copy(float x, float y, @org.jetbrains.annotations.NotNull
        java.lang.String label) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}