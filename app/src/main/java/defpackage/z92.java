package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.F1;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class z92 extends RecyclerView.FJCM {
    public final Calendar a = lf5.d(null);
    public final Calendar b = lf5.d(null);
    public final /* synthetic */ F1 c;

    public z92(F1 f1) {
        this.c = f1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.FJCM
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Long l;
        if ((recyclerView.getAdapter() instanceof yo5) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            yo5 yo5Var = (yo5) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            F1 f1 = this.c;
            for (vy2<Long, Long> vy2Var : f1.q0.g()) {
                Long l2 = vy2Var.a;
                if (l2 != null && (l = vy2Var.b) != null) {
                    long jLongValue = l2.longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = l.longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - yo5Var.c.r0.w.y;
                    int i2 = calendar2.get(1) - yo5Var.c.r0.w.y;
                    View viewQ = gridLayoutManager.q(i);
                    View viewQ2 = gridLayoutManager.q(i2);
                    int i3 = gridLayoutManager.F;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    int i6 = i4;
                    while (i6 <= i5) {
                        View viewQ3 = gridLayoutManager.q(gridLayoutManager.F * i6);
                        if (viewQ3 != null) {
                            canvas.drawRect(i6 == i4 ? (viewQ.getWidth() / 2) + viewQ.getLeft() : 0, viewQ3.getTop() + ((gl) f1.u0.d).a.top, i6 == i5 ? (viewQ2.getWidth() / 2) + viewQ2.getLeft() : recyclerView.getWidth(), viewQ3.getBottom() - ((gl) f1.u0.d).a.bottom, (Paint) f1.u0.h);
                        }
                        i6++;
                    }
                }
            }
        }
    }
}
