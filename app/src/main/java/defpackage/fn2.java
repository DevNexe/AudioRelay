package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class fn2 extends y60<yn2> {
    public fn2(Context context, c15 c15Var) {
        super((bo2) j95.a(context, c15Var).c);
    }

    @Override // defpackage.y60
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.a == co2.CONNECTED;
    }

    @Override // defpackage.y60
    public final boolean c(yn2 yn2Var) {
        yn2 yn2Var2 = yn2Var;
        if (Build.VERSION.SDK_INT >= 26) {
            return (yn2Var2.a && yn2Var2.b) ? false : true;
        }
        return true ^ yn2Var2.a;
    }
}
