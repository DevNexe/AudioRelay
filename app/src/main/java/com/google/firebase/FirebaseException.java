package com.google.firebase;

import defpackage.oa3;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        oa3.f("Detail message must not be empty", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Exception exc) {
        super(str, exc);
        oa3.f("Detail message must not be empty", str);
    }
}
