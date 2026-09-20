package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    public final int w;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.w = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.w = i;
    }
}
