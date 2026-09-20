package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class yw4 extends nk0 {
    public Dialog E0;
    public DialogInterface.OnCancelListener F0;
    public AlertDialog G0;

    @Override // defpackage.nk0
    public final Dialog O() {
        Dialog dialog = this.E0;
        if (dialog != null) {
            return dialog;
        }
        this.v0 = false;
        if (this.G0 == null) {
            Context contextJ = j();
            oa3.h(contextJ);
            this.G0 = new AlertDialog.Builder(contextJ).create();
        }
        return this.G0;
    }

    @Override // defpackage.nk0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
