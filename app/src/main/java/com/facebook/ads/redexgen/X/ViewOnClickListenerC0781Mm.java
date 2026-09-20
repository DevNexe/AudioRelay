package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0781Mm implements View.OnClickListener {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ C0711Jp A01;
    public final /* synthetic */ C0782Mn A02;
    public final /* synthetic */ InterfaceC0785Mq A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC0781Mm(C0782Mn c0782Mn, C0711Jp c0711Jp, InterfaceC0785Mq interfaceC0785Mq, String str, C1U c1u) {
        this.A02 = c0782Mn;
        this.A01 = c0711Jp;
        this.A03 = interfaceC0785Mq;
        this.A04 = str;
        this.A00 = c1u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A02(EnumC0710Jo.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A00(), true)) {
                this.A03.A8j(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                LZ.A0E(new LZ(), this.A02.A03, C0745La.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
