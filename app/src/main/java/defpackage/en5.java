package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class en5 implements dx4.F1 {
    public final /* synthetic */ Context a;

    public en5(Context context) {
        this.a = context;
    }

    @Override // dx4.F1
    public final dx4 a(dx4.CQf cQf) {
        dx4.QnHx qnHx = cQf.c;
        if (qnHx == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.a;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        String str = cQf.b;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new s61(context, str, qnHx, true);
    }
}
