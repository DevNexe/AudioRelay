package defpackage;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
public final class dd2 implements fh1 {
    public final Context a;

    public dd2(Context context) {
        this.a = context;
    }

    @Override // defpackage.fh1
    public final void a(String str) {
        Toast.makeText(this.a, str, 0).show();
    }
}
