package defpackage;

import android.content.Context;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class cu4 extends y60<Boolean> {
    public cu4(Context context, c15 c15Var) {
        super((du4) j95.a(context, c15Var).d);
    }

    @Override // defpackage.y60
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.e;
    }

    @Override // defpackage.y60
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
