package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class be implements PFC {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;

    public be(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.PFC
    public final boolean a(View view) {
        this.b.z(this.a);
        return true;
    }
}
