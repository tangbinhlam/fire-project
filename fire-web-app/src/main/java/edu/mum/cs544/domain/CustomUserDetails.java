package edu.mum.cs544.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomUserDetails implements UserDetails {

    private final User userModel;

    private final List<GrantedAuthority> authorities;

    public CustomUserDetails(final User userModel) {
        // set model
        this.userModel = userModel;

        // Generate authorities/roles
        List<GrantedAuthority> roles = new ArrayList<>();
        userModel.getAuthorities().stream().forEach(authority -> {
                    roles.add(new SimpleGrantedAuthority(authority.getName().name()));
                }
        );
        // Save to immutable collection.
        authorities = Collections.unmodifiableList(roles);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return userModel.getPassword();
    }

    @Override
    public String getUsername() {
        return userModel.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return isEnabled();
    }

    @Override
    public boolean isAccountNonLocked() {
        return isEnabled();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isEnabled();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public User getUserModel() {
        return userModel;
    }

}
