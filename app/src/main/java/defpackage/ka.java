package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler", f = "AndroidServerInputHandler.kt", l = {196, RCHTTPStatusCodes.SUCCESS}, m = "onAudioRecordPermissionGranted")
public final class ka extends b90 {
    public wb4 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ AO9A C;
    public int D;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(AO9A ao9a, z80<? super ka> z80Var) {
        super(z80Var);
        this.C = ao9a;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(null, this);
    }
}
