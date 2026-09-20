package defpackage;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.F1;
import com.google.android.material.datepicker.auxFixed;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class ba2 extends RecyclerView.LPt6Fixed {
    public final /* synthetic */ auxFixed a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ F1 c;

    public ba2(F1 f1, auxFixed auxVar, MaterialButton materialButton) {
        this.c = f1;
        this.a = auxVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt6Fixed
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt6Fixed
    public final void b(RecyclerView recyclerView, int i, int i2) {
        F1 f1 = this.c;
        int iF0 = i < 0 ? ((LinearLayoutManager) f1.w0.getLayoutManager()).F0() : ((LinearLayoutManager) f1.w0.getLayoutManager()).G0();
        auxFixed auxVar = this.a;
        Calendar calendarB = lf5.b(auxVar.d.w.w);
        calendarB.add(2, iF0);
        f1.s0 = new zg2(calendarB);
        Calendar calendarB2 = lf5.b(auxVar.d.w.w);
        calendarB2.add(2, iF0);
        calendarB2.set(5, 1);
        Calendar calendarB3 = lf5.b(calendarB2);
        calendarB3.get(2);
        calendarB3.get(1);
        calendarB3.getMaximum(7);
        calendarB3.getActualMaximum(5);
        calendarB3.getTimeInMillis();
        long timeInMillis = calendarB3.getTimeInMillis();
        this.b.setText(DateUtils.formatDateTime(auxVar.c, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36));
    }
}
