package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class CQf implements DynamiteModule.QnHx {
    @Override // com.google.android.gms.dynamite.DynamiteModule.QnHx
    public final DynamiteModule.QnHx.CQf a(Context context, String str, DynamiteModule.QnHx.InterfaceC0076QnHx interfaceC0076QnHx) {
        DynamiteModule.QnHx.CQf cQf = new DynamiteModule.QnHx.CQf();
        int iA = interfaceC0076QnHx.a(context, str, true);
        cQf.b = iA;
        if (iA != 0) {
            cQf.c = 1;
        } else {
            int iB = interfaceC0076QnHx.b(context, str);
            cQf.a = iB;
            if (iB != 0) {
                cQf.c = -1;
            }
        }
        return cQf;
    }
}
