import React from 'react';
import { render, screen } from '@testing-library/react';
import Diagnosis from './App';

test('renders learn react link', () => {
  render(<Diagnosis />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
