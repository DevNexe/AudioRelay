package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class yx4 implements PFC {
    public final /* synthetic */ SwipeDismissBehavior a;

    public yx4(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.PFC
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        boolean z = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        Field field = bi5.a;
        boolean z2 = bi5.NUlFixed.d(view) == 1;
        int i = swipeDismissBehavior.c;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        bi5.g(view, width);
        view.setAlpha(0.0f);
        return true;
    }
}
