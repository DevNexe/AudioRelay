package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1163aY extends C04046m {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C6C A02;
    public final C7F A03;

    public C1163aY(Context context, C6C c6c) {
        super(context, c6c);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c6c;
        this.A03 = C7F.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A05(HashMap<Integer, C1164aZ> map) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), map, AnonymousClass79.A06);
    }

    public final InterfaceC04136v A0G() {
        return new C1174aj(this);
    }

    public final InterfaceC04136v A0H() {
        return new C1176al(this);
    }

    public final InterfaceC04136v A0I() {
        return new C1177am(this);
    }

    public final InterfaceC04136v A0J() {
        return new C1181aq(this);
    }

    public final InterfaceC04136v A0K() {
        return new C1169ae(this);
    }

    public final InterfaceC04136v A0L() {
        return new C1166ab(this);
    }

    public final InterfaceC04136v A0M() {
        return new C1173ai(this);
    }

    public final InterfaceC04136v A0N() {
        return new C1172ah(this);
    }

    public final InterfaceC04136v A0O() {
        return new C1168ad(this);
    }

    public final InterfaceC04136v A0P() {
        return new C1165aa(this);
    }

    public final InterfaceC04136v A0Q() {
        return new C1167ac(this);
    }

    public final InterfaceC04136v A0R() {
        return new C1170af(this);
    }

    public final InterfaceC04136v A0S() {
        return new C1171ag(this);
    }

    public final InterfaceC04136v A0T() {
        return new C1183as(this);
    }

    public final InterfaceC04136v A0U() {
        return new C1182ar(this);
    }

    public final InterfaceC04136v A0V() {
        return new C1180ap(this);
    }

    public final InterfaceC04136v A0W() {
        return new C1179ao(this);
    }

    public final InterfaceC04136v A0X() {
        return new C1178an(this);
    }

    public final InterfaceC04136v A0Y() {
        return new C1175ak(this);
    }
}
