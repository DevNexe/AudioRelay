package io.ktor.http;

import defpackage.fc2;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsafeHeaderException extends IllegalArgumentException {
    public UnsafeHeaderException(String str) {
        super(fc2.a("Header(s) ", str, " are controlled by the engine and cannot be set explicitly"));
    }
}
