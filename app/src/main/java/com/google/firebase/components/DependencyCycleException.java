package com.google.firebase.components;

import defpackage.ry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {
    public final List<ry<?>> w;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.w = arrayList;
    }
}
