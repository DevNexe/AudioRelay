package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.azefsw.audioconnect.R;
import com.google.android.material.datepicker.F1;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class yo5 extends RecyclerView.LPt8Fixed<QnHx> {
    public final F1<?> c;

    public static class QnHx extends RecyclerView.qc {
        public final TextView t;

        public QnHx(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    public yo5(F1<?> f1) {
        this.c = f1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt8Fixed
    public final int a() {
        return this.c.r0.A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt8Fixed
    public final void c(RecyclerView.qc qcVar, int i) {
        F1<?> f1 = this.c;
        int i2 = f1.r0.w.y + i;
        TextView textView = ((QnHx) qcVar).t;
        String string = textView.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i2)));
        n83 n83Var = f1.u0;
        Calendar calendarC = lf5.c();
        gl glVar = (gl) (calendarC.get(1) == i2 ? n83Var.f : n83Var.d);
        Iterator<Long> it = f1.q0.s().iterator();
        while (it.hasNext()) {
            calendarC.setTimeInMillis(it.next().longValue());
            if (calendarC.get(1) == i2) {
                glVar = (gl) n83Var.e;
            }
        }
        glVar.b(textView);
        textView.setOnClickListener(new xo5(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt8Fixed
    public final RecyclerView.qc d(RecyclerView recyclerView) {
        return new QnHx((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
