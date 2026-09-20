package io.ktor.http;

import defpackage.N;
import defpackage.qc0;

/* JADX INFO: loaded from: classes3.dex */
public final class IllegalHeaderNameException extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    public IllegalHeaderNameException(String str, int i) {
        StringBuilder sbA = N.a("Header name '", str, "' contains illegal character '");
        sbA.append(str.charAt(i));
        sbA.append("' (code ");
        super(qc0.a(sbA, str.charAt(i) & 255, ')'));
    }
}
