package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0774Mf implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C0957Th A01;

    public DialogInterfaceOnClickListenerC0774Mf(C0957Th c0957Th, EditText editText) {
        this.A01 = c0957Th;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A03.execute(new C0958Ti(this, dialogInterface));
    }
}
