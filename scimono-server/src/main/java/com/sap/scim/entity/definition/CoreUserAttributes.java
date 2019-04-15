
package com.sap.scim.entity.definition;

import static com.sap.scim.entity.definition.CoreUserAttributes.Constants.*;
import static com.sap.scim.entity.definition.ResourceConstants.*;
import static com.sap.scim.entity.definition.ResourceConstants.MultivaluedAttributeConstants.*;

import com.sap.scim.entity.User;

public enum CoreUserAttributes implements ScimAttribute<CoreUserAttributes> {
  // @formatter:off
  ID(ID_FIELD, null),
  SCHEMAS(SCHEMAS_FIELD, null),
  EXTERNAL_ID(EXTERNAL_ID_FIELD, null),
  META(META_FIELD, null),
  META_CREATED(META_CREATED_FIELD, META),
  META_LAST_MODIFIED(META_LAST_MODIFIED_FIELD, META),
  META_ATTRIBUTES(META_ATTRIBUTES_FIELD, META),
  META_RESOURCE_TYPE(META_RESOURCE_TYPE_FIELD, META),
  META_LOCATION(META_LOCATION_FIELD, META),
  META_VERSION(META_VERSION_FIELD, META),

  USER_NAME(USER_NAME_FIELD, null),
  DISPLAY_NAME(DISPLAY_NAME_FIELD, null),
  NAME(NAME_FIELD, null),
  NAME_GIVEN_NAME(NAME_GIVEN_NAME_FIELD, NAME),
  NAME_MIDDLE_NAME(NAME_MIDDLE_NAME_FIELD, NAME),
  NAME_FAMILY_NAME(NAME_FAMILY_NAME_FIELD, NAME),
  NAME_FORMATTED(NAME_FORMATTED_FIELD, NAME),
  NAME_HONORIFIC_PREFIX(NAME_HONORIFIC_PREFIX_FIELD, NAME),
  NAME_HONORIFIC_SUFFIX(NAME_HONORIFIC_SUFFIX_FIELD, NAME),
  NICK_NAME(NICK_NAME_FIELD, null),
  PROFILE_URL(PROFILE_URL_FIELD, null),
  TITLE(TITLE_FIELD, null),
  USER_TYPE(USER_TYPE_FIELD, null),
  PREFERRED_LANGUAGE(PREFERRED_LANGUAGE_FIELD, null),
  LOCALE(LOCALE_FIELD, null),
  TIMEZONE(TIMEZONE_FIELD, null),
  ACTIVE(ACTIVE_FIELD, null),

  EMAILS(EMAILS_FIELD, null),
  EMAILS_TYPE(TYPE_FIELD, EMAILS),
  EMAILS_VALUE(VALUE_FIELD, EMAILS),
  EMAILS_OPERATION(OPERATION_FIELD, EMAILS),
  EMAILS_DISPLAY(DISPLAY_FIELD, EMAILS),
  EMAILS_PRIMARY(PRIMARY_FIELD, EMAILS),
  EMAILS_REF(REF_FIELD, EMAILS),

  PHONE_NUMBERS(PHONE_NUMBERS_FIELD, null),
  PHONE_NUMBERS_TYPE(TYPE_FIELD, PHONE_NUMBERS),
  PHONE_NUMBERS_VALUE(VALUE_FIELD, PHONE_NUMBERS),
  PHONE_NUMBERS_OPERATION(OPERATION_FIELD, PHONE_NUMBERS),
  PHONE_NUMBERS_DISPLAY(DISPLAY_FIELD, PHONE_NUMBERS),
  PHONE_NUMBERS_PRIMARY(PRIMARY_FIELD, PHONE_NUMBERS),
  PHONE_NUMBERS_REF(REF_FIELD, PHONE_NUMBERS),

  IMS(IMS_FIELD, null),
  IMS_TYPE(TYPE_FIELD, IMS),
  IMS_VALUE(VALUE_FIELD, IMS),
  IMS_OPERATION(OPERATION_FIELD, IMS),
  IMS_DISPLAY(DISPLAY_FIELD, IMS),
  IMS_PRIMARY(PRIMARY_FIELD, IMS),
  IMS_REF(REF_FIELD, IMS),

  PHOTOS(PHOTOS_FIELD, null),
  PHOTOS_TYPE(TYPE_FIELD, PHOTOS),
  PHOTOS_VALUE(VALUE_FIELD, PHOTOS),
  PHOTOS_OPERATION(OPERATION_FIELD, PHOTOS),
  PHOTOS_DISPLAY(DISPLAY_FIELD, PHOTOS),
  PHOTOS_PRIMARY(PRIMARY_FIELD, PHOTOS),
  PHOTOS_REF(REF_FIELD, PHOTOS),

  GROUPS(GROUPS_FIELD, null),
  GROUPS_TYPE(TYPE_FIELD, GROUPS),
  GROUPS_VALUE(VALUE_FIELD, GROUPS),
  GROUPS_OPERATION(OPERATION_FIELD, GROUPS),
  GROUPS_DISPLAY(DISPLAY_FIELD, GROUPS),
  GROUPS_PRIMARY(PRIMARY_FIELD, GROUPS),
  GROUPS_REF(REF_FIELD, GROUPS),

  ENTITLEMENTS(ENTITLEMENTS_FIELD, null),
  ENTITLEMENTS_TYPE(TYPE_FIELD, ENTITLEMENTS),
  ENTITLEMENTS_VALUE(VALUE_FIELD, ENTITLEMENTS),
  ENTITLEMENTS_OPERATION(OPERATION_FIELD, ENTITLEMENTS),
  ENTITLEMENTS_DISPLAY(DISPLAY_FIELD, ENTITLEMENTS),
  ENTITLEMENTS_PRIMARY(PRIMARY_FIELD, ENTITLEMENTS),
  ENTITLEMENTS_REF(REF_FIELD, ENTITLEMENTS),

  ROLES(ROLES_FIELD, null),
  ROLES_TYPE(TYPE_FIELD, ROLES),
  ROLES_VALUE(VALUE_FIELD, ROLES),
  ROLES_OPERATION(OPERATION_FIELD, ROLES),
  ROLES_DISPLAY(DISPLAY_FIELD, ROLES),
  ROLES_PRIMARY(PRIMARY_FIELD, ROLES),
  ROLES_REF(REF_FIELD, ROLES),

  X509_CERTIFICATES(X509_CERTIFICATES_FIELD, null),
  X509_CERTIFICATES_TYPE(TYPE_FIELD, X509_CERTIFICATES),
  X509_CERTIFICATES_VALUE(VALUE_FIELD, X509_CERTIFICATES),
  X509_CERTIFICATES_OPERATION(OPERATION_FIELD, X509_CERTIFICATES),
  X509_CERTIFICATES_DISPLAY(DISPLAY_FIELD, X509_CERTIFICATES),
  X509_CERTIFICATES_PRIMARY(PRIMARY_FIELD, X509_CERTIFICATES),
  X509_CERTIFICATES_REF(REF_FIELD, X509_CERTIFICATES),

  ADDRESSES(ADDRESSES_FIELD, null),
  ADDRESSES_TYPE(TYPE_FIELD, ADDRESSES),
  ADDRESSES_VALUE(VALUE_FIELD, ADDRESSES),
  ADDRESSES_OPERATION(OPERATION_FIELD, ADDRESSES),
  ADDRESSES_DISPLAY(DISPLAY_FIELD, ADDRESSES),
  ADDRESSES_PRIMARY(PRIMARY_FIELD, ADDRESSES),
  ADDRESSES_REF(REF_FIELD, ADDRESSES),
  ADDRESSES_FORMATTED(ADDRESSES_FORMATTED_FIELD, ADDRESSES),
  ADDRESSES_STREET_ADDRESS(ADDRESSES_STREET_ADDRESS_FIELD, ADDRESSES),
  ADDRESSES_LOCALITY(ADDRESSES_LOCALITY_FIELD, ADDRESSES),
  ADDRESSES_REGION(ADDRESSES_REGION_FIELD, ADDRESSES),
  ADDRESSES_POSTAL_CODE(ADDRESSES_POSTAL_CODE_FIELD, ADDRESSES),
  ADDRESSES_COUNTRY(ADDRESSES_COUNTRY_FIELD, ADDRESSES);
  // @formatter:on

  private static final ScimAttributesFactory<CoreUserAttributes> CORE_USER_ATTRIBUTES_FACTORY = new ScimAttributesFactory<>(CoreUserAttributes::values);

  private ScimAttribute<CoreUserAttributes> scimAttribute;

  CoreUserAttributes(String attributeName, CoreUserAttributes parent) {
    scimAttribute = new ScimAttributeImpl<>(attributeName, User.SCHEMA, parent, CoreUserAttributes::values);
  }

  @Override
  public String scimName() {
    return scimAttribute.scimName();
  }

  @Override
  public String fullAttributePath() {
    return scimAttribute.fullAttributePath();
  }

  @Override
  public String relativePath() {
    return scimAttribute.relativePath();
  }

  @Override
  public CoreUserAttributes subAttributeFrom(String childAttributeName) {
    return scimAttribute.subAttributeFrom(childAttributeName);
  }

  @Override
  public CoreUserAttributes getParent() {
    return scimAttribute.getParent();
  }

  @Override
  public String getSchemaId() {
    return scimAttribute.getSchemaId();
  }

  @Override
  public boolean isTopLevelAttribute() {
    return scimAttribute.isTopLevelAttribute();
  }

  public static CoreUserAttributes from(String attributeName) {
    return CORE_USER_ATTRIBUTES_FACTORY.from(attributeName);
  }

  public interface Constants {
    String USER_NAME_FIELD = "userName";
    String NAME_FIELD = "name";
    String NAME_GIVEN_NAME_FIELD = "givenName";
    String NAME_MIDDLE_NAME_FIELD = "middleName";
    String NAME_FAMILY_NAME_FIELD = "familyName";
    String NAME_FORMATTED_FIELD = "formatted";
    String NAME_HONORIFIC_PREFIX_FIELD = "honorificPrefix";
    String NAME_HONORIFIC_SUFFIX_FIELD = "honorificSuffix";
    String NICK_NAME_FIELD = "nickName";
    String PROFILE_URL_FIELD = "profileUrl";
    String TITLE_FIELD = "title";
    String USER_TYPE_FIELD = "userType";
    String PREFERRED_LANGUAGE_FIELD = "preferredLanguage";
    String LOCALE_FIELD = "locale";
    String TIMEZONE_FIELD = "timezone";
    String ACTIVE_FIELD = "active";
    String EMAILS_FIELD = "emails";
    String PHONE_NUMBERS_FIELD = "phoneNumbers";
    String IMS_FIELD = "ims";
    String PHOTOS_FIELD = "photos";
    String GROUPS_FIELD = "groups";
    String ENTITLEMENTS_FIELD = "entitlements";
    String ROLES_FIELD = "roles";
    String X509_CERTIFICATES_FIELD = "x509Certificates";
    String ADDRESSES_FIELD = "addresses";
    String ADDRESSES_FORMATTED_FIELD = "formatted";
    String ADDRESSES_STREET_ADDRESS_FIELD = "streetAddress";
    String ADDRESSES_LOCALITY_FIELD = "locality";
    String ADDRESSES_REGION_FIELD = "region";
    String ADDRESSES_POSTAL_CODE_FIELD = "postalCode";
    String ADDRESSES_COUNTRY_FIELD = "country";
  }
}