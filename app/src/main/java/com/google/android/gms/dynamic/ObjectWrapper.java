package com.google.android.gms.dynamic;

import android.os.IBinder;
import defpackage.GM;
import defpackage.oa3;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    public final Object w;

    public ObjectWrapper(Object obj) {
        this.w = obj;
    }

    public static <T> T M0(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).w;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(GM.a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        oa3.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
