package defpackage;

import android.view.View;
import com.google.android.material.datepicker.F1;
import com.google.android.material.datepicker.QnHx;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class xo5 implements View.OnClickListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ yo5 x;

    public xo5(yo5 yo5Var, int i) {
        this.x = yo5Var;
        this.w = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yo5 yo5Var = this.x;
        zg2 zg2VarA = zg2.a(this.w, yo5Var.c.s0.x);
        F1<?> f1 = yo5Var.c;
        QnHx qnHx = f1.r0;
        zg2 zg2Var = qnHx.w;
        Calendar calendar = zg2Var.w;
        Calendar calendar2 = zg2VarA.w;
        if (calendar2.compareTo(calendar) < 0) {
            zg2VarA = zg2Var;
        } else {
            zg2 zg2Var2 = qnHx.x;
            if (calendar2.compareTo(zg2Var2.w) > 0) {
                zg2VarA = zg2Var2;
            }
        }
        f1.O(zg2VarA);
        f1.P(1);
    }
}
