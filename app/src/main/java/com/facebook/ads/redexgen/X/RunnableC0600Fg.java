package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0600Fg implements Runnable {
    public static String[] A06 = {"MFzmm2XpKtQDQZ1nrLFzIVLfypAdXqn0", "St6NP3oa8jPcs9ySqX58Qb7cq6M0Lslj", "FY6GSV0T1DmbxtheDZWAefy5bW4XMUrK", "e7zVVEHUrXPHmOTr9XrOqtCewhDOezV9", "rRe4XoYawEGGgKvf4FFgivRzu7z94IPy", "2sUcpRkbdiQEA9XQnsePPVJ2ZVsexJIi", "YygzZHUIY4dTUEusYM1qdSBaSuhDwAUc", "5Y8Iu0wedn9Jl3yvaaWMiUkpwoVz8Vqp"};
    public final /* synthetic */ C0605Fl A00;
    public final /* synthetic */ C0606Fm A01;
    public final /* synthetic */ C0607Fn A02;
    public final /* synthetic */ InterfaceC0608Fo A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public RunnableC0600Fg(C0605Fl c0605Fl, InterfaceC0608Fo interfaceC0608Fo, C0606Fm c0606Fm, C0607Fn c0607Fn, IOException iOException, boolean z) {
        this.A00 = c0605Fl;
        this.A03 = interfaceC0608Fo;
        this.A01 = c0606Fm;
        this.A02 = c0607Fn;
        this.A04 = iOException;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A03.ABJ(this.A00.A00, this.A00.A01, this.A01, this.A02, this.A04, this.A05);
        } catch (Throwable th) {
            String[] strArr = A06;
            if (strArr[7].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[7] = "5YuzUPqIN2qUpgzcgBPCGBub3XZtkUQJ";
            strArr2[2] = "DYAXZKj6jF9OEHVnXiKZJEzpdMmcnACr";
            L0.A00(th, this);
        }
    }
}
