package com.revenuecat.purchases.common;

import defpackage.bl2;
import defpackage.ur1;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributeError {
    private final String keyName;
    private final String message;

    public SubscriberAttributeError(String str, String str2) {
        this.keyName = str;
        this.message = str2;
    }

    public static /* synthetic */ SubscriberAttributeError copy$default(SubscriberAttributeError subscriberAttributeError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriberAttributeError.keyName;
        }
        if ((i & 2) != 0) {
            str2 = subscriberAttributeError.message;
        }
        return subscriberAttributeError.copy(str, str2);
    }

    public final String component1() {
        return this.keyName;
    }

    public final String component2() {
        return this.message;
    }

    public final SubscriberAttributeError copy(String str, String str2) {
        return new SubscriberAttributeError(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberAttributeError)) {
            return false;
        }
        SubscriberAttributeError subscriberAttributeError = (SubscriberAttributeError) obj;
        return ur1.a(this.keyName, subscriberAttributeError.keyName) && ur1.a(this.message, subscriberAttributeError.message);
    }

    public final String getKeyName() {
        return this.keyName;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.keyName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriberAttributeError(keyName=");
        sb.append(this.keyName);
        sb.append(", message=");
        return bl2.c(sb, this.message, ')');
    }
}
