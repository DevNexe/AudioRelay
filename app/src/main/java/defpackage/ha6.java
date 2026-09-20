package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ha6 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsResult w;

    public ha6(JsResult jsResult) {
        this.w = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.w.cancel();
    }
}
