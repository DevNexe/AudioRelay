package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class do2 extends y60<yn2> {
    public do2(Context context, c15 c15Var) {
        super((bo2) j95.a(context, c15Var).c);
    }

    @Override // defpackage.y60
    public final boolean b(WorkSpec workSpec) {
        co2 co2Var = workSpec.j.a;
        return co2Var == co2.UNMETERED || (Build.VERSION.SDK_INT >= 30 && co2Var == co2.TEMPORARILY_UNMETERED);
    }

    @Override // defpackage.y60
    public final boolean c(yn2 yn2Var) {
        yn2 yn2Var2 = yn2Var;
        return !yn2Var2.a || yn2Var2.c;
    }
}
