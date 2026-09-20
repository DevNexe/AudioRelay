package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class jn2 extends y60<yn2> {
    public static final String e = s52.e("NetworkMeteredCtrlr");

    public jn2(Context context, c15 c15Var) {
        super((bo2) j95.a(context, c15Var).c);
    }

    @Override // defpackage.y60
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.a == co2.METERED;
    }

    @Override // defpackage.y60
    public final boolean c(yn2 yn2Var) {
        yn2 yn2Var2 = yn2Var;
        if (Build.VERSION.SDK_INT >= 26) {
            return (yn2Var2.a && yn2Var2.c) ? false : true;
        }
        s52.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !yn2Var2.a;
    }
}
