package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j27 implements hi6, k37 {
    public final /* synthetic */ r27 w;

    public /* synthetic */ j27(r27 r27Var) {
        this.w = r27Var;
    }

    @Override // defpackage.k37
    public final void a(Bundle bundle, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        r27 r27Var = this.w;
        if (!zIsEmpty) {
            r27Var.zzaz().m(new zz6(this, str, bundle));
            return;
        }
        dq6 dq6Var = r27Var.l;
        if (dq6Var != null) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.c("_err", "AppId not known when logging event");
        }
    }

    @Override // defpackage.hi6
    public final void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.w.i(str, i, th, bArr, map);
    }
}
