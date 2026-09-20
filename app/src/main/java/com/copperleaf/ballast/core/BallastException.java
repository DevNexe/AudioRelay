package com.copperleaf.ballast.core;

import defpackage.ur1;

/* JADX INFO: loaded from: classes.dex */
public final class BallastException extends RuntimeException {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BallastException)) {
            return false;
        }
        ((BallastException) obj).getClass();
        return ur1.a(null, null) && ur1.a(null, null) && ur1.a(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "BallastException(_cause=null, handled=false, latestState=null, inputSequence=null)";
    }
}
