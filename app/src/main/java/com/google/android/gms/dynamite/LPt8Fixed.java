package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed implements DynamiteModule.QnHx {
    @Override // com.google.android.gms.dynamite.DynamiteModule.QnHx
    public final DynamiteModule.QnHx.CQf a(Context context, String str, DynamiteModule.QnHx.InterfaceC0076QnHx interfaceC0076QnHx) {
        int iA;
        DynamiteModule.QnHx.CQf cQf = new DynamiteModule.QnHx.CQf();
        int iB = interfaceC0076QnHx.b(context, str);
        cQf.a = iB;
        int i = 0;
        if (iB != 0) {
            iA = interfaceC0076QnHx.a(context, str, false);
            cQf.b = iA;
        } else {
            iA = interfaceC0076QnHx.a(context, str, true);
            cQf.b = iA;
        }
        int i2 = cQf.a;
        if (i2 == 0) {
            if (iA == 0) {
                cQf.c = 0;
            }
            return cQf;
        }
        i = i2;
        if (i >= iA) {
            cQf.c = -1;
        } else {
            cQf.c = 1;
        }
        return cQf;
    }
}
